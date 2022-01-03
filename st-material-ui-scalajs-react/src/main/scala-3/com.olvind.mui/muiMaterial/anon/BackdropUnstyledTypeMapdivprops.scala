package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.anon.PartialBackdropUnstyledClasses
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/BackdropUnstyled.BackdropUnstyledTypeMap<{}, 'div'>['props'] */
trait BackdropUnstyledTypeMapdivprops extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialBackdropUnstyledClasses] = js.undefined
  
  /**
    * The components used for each slot inside the Backdrop.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var components: js.UndefOr[com.olvind.mui.muiBase.anon.Root] = js.undefined
  
  /**
    * The props used for each slot inside the Backdrop.
    * @default {}
    */
  var componentsProps: js.UndefOr[com.olvind.mui.muiBase.anon.`0`] = js.undefined
  
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
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialBackdropUnstyledClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setComponents(value: com.olvind.mui.muiBase.anon.Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: com.olvind.mui.muiBase.anon.`0`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
  }
}
