package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `35` extends StObject {
  
  var defaultComponent: span = js.native
  
  var props: js.Object with Active = js.native
}
object `35` {
  
  @scala.inline
  def apply(props: js.Object with Active): `35` = {
    val __obj = js.Dynamic.literal(defaultComponent = "span", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: span): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with Active): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
