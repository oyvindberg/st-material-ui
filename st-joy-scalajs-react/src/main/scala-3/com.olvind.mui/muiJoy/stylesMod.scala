package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.GetColor
import com.olvind.mui.muiJoy.anon.Name
import com.olvind.mui.muiJoy.anon.PropsWithChildren
import com.olvind.mui.muiJoy.anon.PropsWithChildrenPartialCssVarsProviderC
import com.olvind.mui.muiJoy.stylesColorInversionMod.ColorInversionProviderProps
import com.olvind.mui.muiJoy.stylesExtendThemeMod.CssVarsThemeOptions
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiJoy.stylesTypesThemeMod.ThemeCssVar
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.createStyledMod.CreateMUIStyled
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@mui/joy/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ColorInversionProvider(param0: ColorInversionProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ColorInversionProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(useColorScheme, getInitColorSchemeScript) */ inline def CssVarsProvider(props: PropsWithChildrenPartialCssVarsProviderC): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CssVarsProvider")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def ThemeProvider(param0: PropsWithChildren): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createGetCssVar(): js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGetCssVar")().asInstanceOf[js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ]]
  inline def createGetCssVar(cssVarPrefix: String): js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGetCssVar")(cssVarPrefix.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ]]
  
  inline def extendTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("extendTheme")().asInstanceOf[Theme]
  inline def extendTheme(themeOptions: CssVarsThemeOptions): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("extendTheme")(themeOptions.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def shouldSkipGeneratingVar(keys: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldSkipGeneratingVar")(keys.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@mui/joy/styles", "styled")
  @js.native
  val styled: CreateMUIStyled[Theme] = js.native
  
  inline def useColorInversion(): GetColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorInversion")().asInstanceOf[GetColor]
  inline def useColorInversion(childVariant: VariantProp): GetColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorInversion")(childVariant.asInstanceOf[js.Any]).asInstanceOf[GetColor]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
  
  inline def useThemeProps[T /* <: js.Object */](param0: Name[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProps")(param0.asInstanceOf[js.Any]).asInstanceOf[T]
}
