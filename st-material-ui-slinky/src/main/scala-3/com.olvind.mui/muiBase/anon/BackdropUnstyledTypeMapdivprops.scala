package com.olvind.mui.muiBase.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/BackdropUnstyled/BackdropUnstyled.BackdropUnstyledTypeMap<{}, 'div'>['props'] */
trait BackdropUnstyledTypeMapdivprops extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialBackdropUnstyledClasses] = js.undefined
  
  /**
    * The components used for each slot inside the Backdrop.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var components: js.UndefOr[Root] = js.undefined
  
  /**
    * The props used for each slot inside the Backdrop.
    * @default {}
    */
  var componentsProps: js.UndefOr[`0`] = js.undefined
  
  /**
    * If `true`, the backdrop is invisible.
    * It can be used when rendering a popover or a custom select component.
    * @default false
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
}
object BackdropUnstyledTypeMapdivprops {
  
  inline def apply(): BackdropUnstyledTypeMapdivprops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackdropUnstyledTypeMapdivprops]
  }
  
  extension [Self <: BackdropUnstyledTypeMapdivprops](x: Self) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialBackdropUnstyledClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: `0`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
  }
}
