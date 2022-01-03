package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends StObject {
  
  var defaultComponent: div = js.native
  
  var props: js.Object with Children = js.native
}
object Props {
  
  @scala.inline
  def apply(props: js.Object with Children): Props = {
    val __obj = js.Dynamic.literal(defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Object with Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
