package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.li
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `21` extends StObject {
  
  var defaultComponent: li = js.native
  
  var props: js.Object with AutoFocus = js.native
}
object `21` {
  
  @scala.inline
  def apply(props: js.Object with AutoFocus): `21` = {
    val __obj = js.Dynamic.literal(defaultComponent = "li", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: li): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with AutoFocus): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
