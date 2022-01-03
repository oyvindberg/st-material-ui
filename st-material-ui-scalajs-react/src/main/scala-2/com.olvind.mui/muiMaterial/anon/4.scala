package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var defaultComponent: button = js.native
  
  var props: js.Object with DisableElevation = js.native
}
object `4` {
  
  @scala.inline
  def apply(props: js.Object with DisableElevation): `4` = {
    val __obj = js.Dynamic.literal(defaultComponent = "button", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: button): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with DisableElevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
