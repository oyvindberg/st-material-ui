package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemButtonListItemButtonMod.ListItemButtonBaseProps
import com.olvind.mui.muiMaterial.muiMaterialStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17` extends StObject {
  
  var defaultComponent: div = js.native
  
  var props: js.Object with ListItemButtonBaseProps = js.native
}
object `17` {
  
  @scala.inline
  def apply(props: js.Object with ListItemButtonBaseProps): `17` = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with ListItemButtonBaseProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
