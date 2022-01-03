package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.menu
import com.olvind.mui.muiMaterial.muiMaterialStrings.selectedMenu
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFocusItem extends StObject {
  
  /**
    * If `true`, will focus the `[role="menu"]` container and move into tab order.
    * @default false
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, will focus the first menuitem if `variant="menu"` or selected item
    * if `variant="selectedMenu"`.
    * @default false
    */
  var autoFocusItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * MenuList contents, normally `MenuItem`s.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * If `true`, the menu items will not wrap focus.
    * @default false
    */
  var disableListWrap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, will allow focus on disabled items.
    * @default false
    */
  var disabledItemsFocusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The variant to use. Use `menu` to prevent selected items from impacting the initial focus
    * and the vertical alignment relative to the anchor element.
    * @default 'selectedMenu'
    */
  var variant: js.UndefOr[menu | selectedMenu] = js.undefined
}
object AutoFocusItem {
  
  inline def apply(): AutoFocusItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFocusItem]
  }
  
  extension [Self <: AutoFocusItem](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusItem(value: Boolean): Self = StObject.set(x, "autoFocusItem", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusItemUndefined: Self = StObject.set(x, "autoFocusItem", js.undefined)
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisableListWrap(value: Boolean): Self = StObject.set(x, "disableListWrap", value.asInstanceOf[js.Any])
    
    inline def setDisableListWrapUndefined: Self = StObject.set(x, "disableListWrap", js.undefined)
    
    inline def setDisabledItemsFocusable(value: Boolean): Self = StObject.set(x, "disabledItemsFocusable", value.asInstanceOf[js.Any])
    
    inline def setDisabledItemsFocusableUndefined: Self = StObject.set(x, "disabledItemsFocusable", js.undefined)
    
    inline def setVariant(value: menu | selectedMenu): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
