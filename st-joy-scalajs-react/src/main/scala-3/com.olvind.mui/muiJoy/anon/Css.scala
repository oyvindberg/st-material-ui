package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesThemeMod.ThemeVars
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  var css: Record[String, String | Double]
  
  var vars: ThemeVars
}
object Css {
  
  inline def apply(css: Record[String, String | Double], vars: ThemeVars): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    inline def setCss(value: Record[String, String | Double]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setVars(value: ThemeVars): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
  }
}
