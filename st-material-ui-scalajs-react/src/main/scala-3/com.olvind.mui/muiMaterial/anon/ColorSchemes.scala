package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSchemes extends StObject {
  
  var colorSchemes: RecordSupportedColorSchemeRecordstringan
  
  var cssVarPrefix: js.UndefOr[String] = js.undefined
}
object ColorSchemes {
  
  inline def apply(colorSchemes: RecordSupportedColorSchemeRecordstringan): ColorSchemes = {
    val __obj = js.Dynamic.literal(colorSchemes = colorSchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemes]
  }
  
  extension [Self <: ColorSchemes](x: Self) {
    
    inline def setColorSchemes(value: RecordSupportedColorSchemeRecordstringan): Self = StObject.set(x, "colorSchemes", value.asInstanceOf[js.Any])
    
    inline def setCssVarPrefix(value: String): Self = StObject.set(x, "cssVarPrefix", value.asInstanceOf[js.Any])
    
    inline def setCssVarPrefixUndefined: Self = StObject.set(x, "cssVarPrefix", js.undefined)
  }
}
