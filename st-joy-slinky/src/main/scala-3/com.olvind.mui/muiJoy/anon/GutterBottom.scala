package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesThemeMod.TextColor
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.typographyTypographyPropsMod.TypographyPropsColorOverrides
import com.olvind.mui.muiJoy.typographyTypographyPropsMod.TypographyPropsVariantOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.std.Partial
import com.olvind.mui.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GutterBottom extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, TypographyPropsColorOverrides]] = js.undefined
  
  /**
    * Element placed after the children.
    */
  var endDecorator: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * If `true`, the text will have a bottom margin.
    * @default false
    */
  var gutterBottom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applies the theme typography styles.
    * @default 'body1'
    */
  var level: js.UndefOr[
    (/* keyof @mui/joy.@mui/joy/styles/types/typography.TypographySystem */ String) | "inherit"
  ] = js.undefined
  
  /**
    * The component maps the variant prop to a range of different HTML element types.
    * For instance, body1 to `<h6>`.
    * If you wish to change that mapping, you can provide your own.
    * Alternatively, you can use the `component` prop.
    * @default {
    *   h1: 'h1',
    *   h2: 'h2',
    *   h3: 'h3',
    *   h4: 'h4',
    *   h5: 'h5',
    *   h6: 'h6',
    *   body1: 'p',
    *   body2: 'p',
    *   body3: 'p',
    *   inherit: 'p',
    * }
    */
  var levelMapping: js.UndefOr[
    Partial[
      Record[
        (/* keyof @mui/joy.@mui/joy/styles/types/typography.TypographySystem */ String) | "inherit", 
        String
      ]
    ]
  ] = js.undefined
  
  /**
    * If `true`, the text will not wrap, but instead will truncate with a text overflow ellipsis.
    *
    * Note that text overflow can only happen with block or inline-block level elements
    * (the element needs to have a width in order to overflow).
    * @default false
    */
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Element placed before the children.
    */
  var startDecorator: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The system color.
    */
  var textColor: js.UndefOr[TextColor] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, TypographyPropsVariantOverrides]] = js.undefined
}
object GutterBottom {
  
  inline def apply(): GutterBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GutterBottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GutterBottom] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, TypographyPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndDecorator(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setGutterBottom(value: Boolean): Self = StObject.set(x, "gutterBottom", value.asInstanceOf[js.Any])
    
    inline def setGutterBottomUndefined: Self = StObject.set(x, "gutterBottom", js.undefined)
    
    inline def setLevel(value: (/* keyof @mui/joy.@mui/joy/styles/types/typography.TypographySystem */ String) | "inherit"): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelMapping(
      value: Partial[
          Record[
            (/* keyof @mui/joy.@mui/joy/styles/types/typography.TypographySystem */ String) | "inherit", 
            String
          ]
        ]
    ): Self = StObject.set(x, "levelMapping", value.asInstanceOf[js.Any])
    
    inline def setLevelMappingUndefined: Self = StObject.set(x, "levelMapping", js.undefined)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setStartDecorator(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTextColor(value: TextColor): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, TypographyPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
