package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23` extends StObject {
  
  var defaultComponent: ul = js.native
  
  var props: js.Object with AutoFocusItem = js.native
}
object `23` {
  
  @scala.inline
  def apply(props: js.Object with AutoFocusItem): `23` = {
    val __obj = js.Dynamic.literal(defaultComponent = "ul", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: ul): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with AutoFocusItem): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
