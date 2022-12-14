package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import com.olvind.mui.muiMaterial.anon.Css
import com.olvind.mui.muiMaterial.anon.RecordSupportedColorSchemeColorSystem
import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.Mixins
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Transitions
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography
import com.olvind.mui.muiMaterial.stylesShadowsMod.Shadows
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndex
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.Spacing
import com.olvind.mui.muiSystem.createThemeShapeMod.Shape
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssVarsTheme
  extends StObject
     with ColorSystem {
  
  var breakpints: Breakpoints = js.native
  
  var colorSchemes: RecordSupportedColorSchemeColorSystem = js.native
  
  var cssVarPrefix: String = js.native
  
  def generateCssVars(): Css = js.native
  def generateCssVars(colorScheme: SupportedColorScheme): Css = js.native
  
  def getColorSchemeSelector(colorScheme: SupportedColorScheme): String = js.native
  
  def getCssVar(field: ThemeCssVar, vars: ThemeCssVar*): String = js.native
  
  var mixins: Mixins = js.native
  
  var shadows: Shadows = js.native
  
  var shape: Shape = js.native
  
  /**
    * A function to determine if the key, value should be attached as CSS Variable
    * `keys` is an array that represents the object path keys.
    *  Ex, if the theme is { foo: { bar: 'var(--test)' } }
    *  then, keys = ['foo', 'bar']
    *        value = 'var(--test)'
    */
  def shouldSkipGeneratingVar(keys: js.Array[String], value: String): Boolean = js.native
  def shouldSkipGeneratingVar(keys: js.Array[String], value: Double): Boolean = js.native
  
  // Default theme tokens
  var spacing: Spacing = js.native
  
  var transitions: Transitions = js.native
  
  var typography: Typography = js.native
  
  def unstable_sx(props: SxProps[CssVarsTheme]): CSSObject = js.native
  
  var unstable_sxConfig: SxConfig = js.native
  
  var vars: ThemeVars = js.native
  
  var zIndex: ZIndex = js.native
}
