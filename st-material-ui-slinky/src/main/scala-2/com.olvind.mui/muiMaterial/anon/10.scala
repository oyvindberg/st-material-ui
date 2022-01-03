package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var defaultComponent: button = js.native
  
  var props: js.Object with DisableRipple = js.native
}
object `10` {
  
  @scala.inline
  def apply(props: js.Object with DisableRipple): `10` = {
    val __obj = js.Dynamic.literal(defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with DisableRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
