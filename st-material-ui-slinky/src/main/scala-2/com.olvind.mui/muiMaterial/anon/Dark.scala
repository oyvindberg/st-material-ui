package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dark extends StObject {
  
  var dark: Double = js.native
  
  var light: Double = js.native
}
object Dark {
  
  @scala.inline
  def apply(dark: Double, light: Double): Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
  
  @scala.inline
  implicit class DarkMutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: Double): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: Double): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
