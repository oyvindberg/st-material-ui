package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.DefaultColorScheme
import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.ExtendedColorScheme
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/joy.@mui/joy/styles/variantUtils.ThemeFragment & {getColorSchemeSelector (colorScheme : @mui/joy.@mui/joy/styles/types/colorScheme.DefaultColorScheme | @mui/joy.@mui/joy/styles/types/colorScheme.ExtendedColorScheme): string} */
@js.native
trait ThemeFragment extends StObject {
  
  var cssVarPrefix: js.UndefOr[String] = js.native
  
  def getColorSchemeSelector(colorScheme: DefaultColorScheme): String = js.native
  def getColorSchemeSelector(colorScheme: ExtendedColorScheme): String = js.native
  
  def getCssVar(args: Any*): String = js.native
  
  var palette: Record[String, Any] = js.native
}
