package com.olvind.mui.muiMaterial

import com.olvind.mui.emotionSerialize.mod.CSSInterpolation
import com.olvind.mui.emotionSerialize.mod.Keyframes
import com.olvind.mui.emotionUtils.mod.SerializedStyles
import com.olvind.mui.muiMaterial.adaptV4ThemeMod.DeprecatedThemeOptions
import com.olvind.mui.muiMaterial.anon.NameProps
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.createThemeMod.ThemeOptions
import com.olvind.mui.muiMaterial.createTransitionsMod.Duration_
import com.olvind.mui.muiMaterial.createTransitionsMod.Easing_
import com.olvind.mui.muiMaterial.responsiveFontSizesMod.ResponsiveFontSizesOptions
import com.olvind.mui.muiMaterial.themeProviderMod.ThemeProviderProps
import com.olvind.mui.muiMaterial.useThemePropsMod.ThemeWithProps
import com.olvind.mui.muiMaterial.useThemePropsMod.ThemedProps
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiStyledEngine.styledEngineProviderStyledEngineProviderMod.StyledEngineProviderProps
import com.olvind.mui.muiSystem.colorManipulatorMod.ColorObject
import com.olvind.mui.muiSystem.createStyledMod.CreateMUIStyled
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import com.olvind.mui.std.Record
import com.olvind.mui.std.TemplateStringsArray
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@mui/material/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def StyledEngineProvider(props: StyledEngineProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyledEngineProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @scala.inline
  def adaptV4Theme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptV4Theme")().asInstanceOf[Theme]
  @scala.inline
  def adaptV4Theme(options: DeprecatedThemeOptions): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptV4Theme")(options.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  @scala.inline
  def alpha(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createMuiTheme(options: ThemeOptions, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  @scala.inline
  def createMuiTheme(options: Unit, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  
  @scala.inline
  def createStyles(styles: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def createTheme(options: ThemeOptions, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  @scala.inline
  def createTheme(options: Unit, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  
  @scala.inline
  def css(args: CSSInterpolation*): SerializedStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[SerializedStyles]
  @scala.inline
  def css(template: TemplateStringsArray, args: CSSInterpolation*): SerializedStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[SerializedStyles]
  
  @scala.inline
  def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def decomposeColor(color: String): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
  
  @JSImport("@mui/material/styles", "duration")
  @js.native
  val duration: Duration_ = js.native
  
  @JSImport("@mui/material/styles", "easing")
  @js.native
  val easing: Easing_ = js.native
  
  @scala.inline
  def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Custom styled utility that has a default MUI theme.
    * @param tag HTML tag or component that should serve as base.
    * @param options Styled options for the created component.
    * @returns React component that has styles attached to it.
    */
  @JSImport("@mui/material/styles", "experimentalStyled")
  @js.native
  val experimentalStyled: CreateMUIStyled[Theme] = js.native
  
  @scala.inline
  def experimentalSx[T /* <: js.Object */](styles: SxProps[T]): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_sx")(styles.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  @scala.inline
  def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hslToRgb(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def keyframes(args: CSSInterpolation*): Keyframes = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[Keyframes]
  @scala.inline
  def keyframes(template: TemplateStringsArray, args: CSSInterpolation*): Keyframes = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Keyframes]
  
  @scala.inline
  def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def makeStyles(stylesCreator: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(stylesCreator.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def makeStyles(stylesCreator: Any, options: js.Object): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(stylesCreator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def recomposeColor(color: ColorObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def responsiveFontSizes(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  @scala.inline
  def responsiveFontSizes(theme: Theme, options: ResponsiveFontSizesOptions): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  @scala.inline
  def rgbToHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Custom styled utility that has a default MUI theme.
    * @param tag HTML tag or component that should serve as base.
    * @param options Styled options for the created component.
    * @returns React component that has styles attached to it.
    */
  @JSImport("@mui/material/styles", "styled")
  @js.native
  val styled: CreateMUIStyled[Theme] = js.native
  
  @scala.inline
  def unstableCreateMuiStrictModeTheme(options: ThemeOptions, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  @scala.inline
  def unstableCreateMuiStrictModeTheme(options: Unit, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  
  @scala.inline
  def unstableGetUnit(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getUnit")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unstableToUnitless(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_toUnitless")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]
  
  @scala.inline
  def useThemeProps[Theme /* <: ThemeWithProps */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name]): Props with (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProps")(params.asInstanceOf[js.Any]).asInstanceOf[Props with (ThemedProps[Theme, Name])]
  
  @scala.inline
  def withStyles(stylesCreator: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(stylesCreator.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def withStyles(stylesCreator: Any, options: js.Object): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(stylesCreator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def withTheme(Component: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  type ClassNameMap[ClassKey /* <: String */] = Record[ClassKey, String]
  
  @js.native
  trait StyledComponentProps[ClassKey /* <: String */] extends StObject {
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.native
  }
  object StyledComponentProps {
    
    @scala.inline
    def apply[ClassKey /* <: String */](): StyledComponentProps[ClassKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledComponentProps[ClassKey]]
    }
    
    @scala.inline
    implicit class StyledComponentPropsMutableBuilder[Self <: StyledComponentProps[_], ClassKey /* <: String */] (val x: Self with StyledComponentProps[ClassKey]) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Partial[ClassNameMap[ClassKey]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    }
  }
}
