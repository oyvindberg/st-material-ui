package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.anon.PartialBackdropUnstyledClasses
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/BackdropUnstyled.BackdropUnstyledTypeMap<{}, 'div'>['props'] */
@js.native
trait BackdropUnstyledTypeMapdivprops extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialBackdropUnstyledClasses] = js.native
  
  /**
    * The components used for each slot inside the Backdrop.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var components: js.UndefOr[com.olvind.mui.muiBase.anon.Root] = js.native
  
  /**
    * The props used for each slot inside the Backdrop.
    * @default {}
    */
  var componentsProps: js.UndefOr[com.olvind.mui.muiBase.anon.`0`] = js.native
  
  /**
    * If `true`, the backdrop is invisible.
    * It can be used when rendering a popover or a custom select component.
    * @default false
    */
  var invisible: js.UndefOr[Boolean] = js.native
}
object BackdropUnstyledTypeMapdivprops {
  
  @scala.inline
  def apply(): BackdropUnstyledTypeMapdivprops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackdropUnstyledTypeMapdivprops]
  }
  
  @scala.inline
  implicit class BackdropUnstyledTypeMapdivpropsMutableBuilder[Self <: BackdropUnstyledTypeMapdivprops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: PartialBackdropUnstyledClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setComponents(value: com.olvind.mui.muiBase.anon.Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsProps(value: com.olvind.mui.muiBase.anon.`0`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
  }
}
