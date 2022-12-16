package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentsProps extends StObject {
  
  /**
    * The components used for each slot inside.
    *
    * This prop is an alias for the `slots` prop.
    * It's recommended to use the `slots` prop instead.
    *
    * @default {}
    */
  var components: js.UndefOr[Root] = js.undefined
  
  /**
    * The extra props for the slot components.
    * You can override the existing props or add new ones.
    *
    * This prop is an alias for the `slotProps` prop.
    * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
    *
    * @default {}
    */
  var componentsProps: js.UndefOr[`15`] = js.undefined
  
  /**
    * The extra props for the slot components.
    * You can override the existing props or add new ones.
    *
    * This prop is an alias for the `componentsProps` prop, which will be deprecated in the future.
    *
    * @default {}
    */
  var slotProps: js.UndefOr[`15`] = js.undefined
  
  /**
    * The components used for each slot inside.
    *
    * This prop is an alias for the `components` prop, which will be deprecated in the future.
    *
    * @default {}
    */
  var slots: js.UndefOr[`1`] = js.undefined
}
object ComponentsProps {
  
  inline def apply(): ComponentsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentsProps] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: `15`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setSlotProps(value: `15`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: `1`): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
