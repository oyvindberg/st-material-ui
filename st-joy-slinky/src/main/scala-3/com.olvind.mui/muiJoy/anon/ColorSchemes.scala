package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSchemes extends StObject {
  
  var colorSchemes: RecordDefaultColorSchemeRecordstringany
  
  var cssVarPrefix: js.UndefOr[String] = js.undefined
}
object ColorSchemes {
  
  inline def apply(colorSchemes: RecordDefaultColorSchemeRecordstringany): ColorSchemes = {
    val __obj = js.Dynamic.literal(colorSchemes = colorSchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSchemes] (val x: Self) extends AnyVal {
    
    inline def setColorSchemes(value: RecordDefaultColorSchemeRecordstringany): Self = StObject.set(x, "colorSchemes", value.asInstanceOf[js.Any])
    
    inline def setCssVarPrefix(value: String): Self = StObject.set(x, "cssVarPrefix", value.asInstanceOf[js.Any])
    
    inline def setCssVarPrefixUndefined: Self = StObject.set(x, "cssVarPrefix", js.undefined)
  }
}
