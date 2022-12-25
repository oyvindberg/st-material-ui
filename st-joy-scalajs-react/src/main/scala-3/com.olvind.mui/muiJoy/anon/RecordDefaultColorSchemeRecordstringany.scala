package com.olvind.mui.muiJoy.anon

import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@mui/joy.@mui/joy/styles/types.DefaultColorScheme, std.Record<string, any>> */
trait RecordDefaultColorSchemeRecordstringany extends StObject {
  
  var dark: Record[String, Any]
  
  var light: Record[String, Any]
}
object RecordDefaultColorSchemeRecordstringany {
  
  inline def apply(dark: Record[String, Any], light: Record[String, Any]): RecordDefaultColorSchemeRecordstringany = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDefaultColorSchemeRecordstringany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordDefaultColorSchemeRecordstringany] (val x: Self) extends AnyVal {
    
    inline def setDark(value: Record[String, Any]): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: Record[String, Any]): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
