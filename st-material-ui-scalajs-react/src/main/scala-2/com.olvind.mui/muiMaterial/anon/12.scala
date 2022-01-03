package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends StObject {
  
  var defaultComponent: button = js.native
  
  var props: js.Object with Edge = js.native
}
object `12` {
  
  @scala.inline
  def apply(props: js.Object with Edge): `12` = {
    val __obj = js.Dynamic.literal(defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with Edge): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
