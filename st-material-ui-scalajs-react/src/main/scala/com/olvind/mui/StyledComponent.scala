package com.olvind.mui

import com.olvind.mui.emotionReact.typesHelperMod.PropsOf
import com.olvind.mui.emotionStyled.typesBaseMod.{StyledComponent as RawStyledComponent, StyledOptions}
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.stylesMod.styled
import com.olvind.mui.muiStyledEngine.anon.Ref
import com.olvind.mui.muiStyledEngine.mod.{
  CreateMUIStyled,
  CreateStyledComponent,
  Interpolation,
  InterpolationPrimitive
}
import com.olvind.mui.muiSystem.createStyledMod.{MUIStyledCommonProps, MuiStyledOptions}

import scala.language.implicitConversions
import scala.scalajs.js

case class StyledComponent[ReactBuilder](
    component: Any,
    mkBuilder: Any => ReactBuilder
)

// provide a mutable, typed builder interface to constructing styled components
object StyledComponent {
  implicit def ToBuilder[ReactBuilder](styled: StyledComponent[ReactBuilder]): ReactBuilder =
    styled.mkBuilder(styled.component)

  type InterpolationInput[Props] =
    Props & MUIStyledCommonProps[Theme] & com.olvind.mui.muiStyledEngine.anon.Theme[Theme]

  case class Builder[Props, ReactBuilder](
      baseComponent:  Any,
      options:        js.Object,
      interpolations: js.Array[Interpolation[InterpolationInput[Props]]],
      mkBuilder:      Any => ReactBuilder
  ) {
    def opts(x: StyledOptions[Props & MUIStyledCommonProps[Theme]]): this.type = {
      js.Object.assign(this.options, x)
      this
    }
    def opts(x: MuiStyledOptions): this.type = {
      js.Object.assign(this.options, x)
      this
    }

    def fn(f: (Theme, Props & MUIStyledCommonProps[Theme]) => InterpolationPrimitive): StyledComponent.Builder[Props, ReactBuilder] = {
      val raw: js.Function1[InterpolationInput[Props], InterpolationPrimitive] =
        in => f((in: com.olvind.mui.muiStyledEngine.anon.Theme[Theme]).theme, in)
      interpolations.push(raw)
      this
    }

    def apply(i: InterpolationPrimitive): this.type = {
      interpolations.push(i)
      this
    }

    def build(): StyledComponent[ReactBuilder] = {
      val optionsNudged =
        options.asInstanceOf[StyledOptions[PropsOf[Any] & MUIStyledCommonProps[Theme]] & MuiStyledOptions]

      val createStyled: CreateStyledComponent[PropsOf[Any] & MUIStyledCommonProps[Theme], js.Object, Ref[Any], Theme] =
        styled.apply[Any](baseComponent, optionsNudged)

      val createStyledNudged: CreateStyledComponent[Props & MUIStyledCommonProps[Theme], js.Object, Ref[Any], Theme] =
        createStyled
          .asInstanceOf[CreateStyledComponent[Props & MUIStyledCommonProps[Theme], js.Object, Ref[Any], Theme]]

      val newComponent: RawStyledComponent[Props & MUIStyledCommonProps[Theme], js.Object, Ref[Any]] =
        createStyledNudged(interpolations.toArray*)

      StyledComponent(newComponent, mkBuilder)
    }
  }
}
