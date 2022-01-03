package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components extends StObject {
  
  /**
    * The components used for each slot inside the InputBase.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var components: js.UndefOr[`14`] = js.native
  
  /**
    * The props used for each slot inside the Input.
    * @default {}
    */
  var componentsProps: js.UndefOr[`15`] = js.native
}
object Components {
  
  @scala.inline
  def apply(): Components = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components]
  }
  
  @scala.inline
  implicit class ComponentsMutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: `14`): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsProps(value: `15`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
  }
}
