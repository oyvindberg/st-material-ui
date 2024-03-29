package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.JSXElementConstructor
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideSortIcon extends StObject {
  
  /**
    * Sort icon to use.
    * @default ArrowDownwardIcon
    */
  var IconComponent: js.UndefOr[JSXElementConstructor[ClassNameString]] = js.undefined
  
  /**
    * If `true`, the label will have the active styling (should be true for the sorted column).
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Label contents, the arrow will be appended automatically.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTableSortLabelClasses] = js.undefined
  
  /**
    * The current sort direction.
    * @default 'asc'
    */
  var direction: js.UndefOr["asc" | "desc"] = js.undefined
  
  /**
    * Hide sort icon when active is false.
    * @default false
    */
  var hideSortIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
}
object HideSortIcon {
  
  inline def apply(): HideSortIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideSortIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HideSortIcon] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialTableSortLabelClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDirection(value: "asc" | "desc"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHideSortIcon(value: Boolean): Self = StObject.set(x, "hideSortIcon", value.asInstanceOf[js.Any])
    
    inline def setHideSortIconUndefined: Self = StObject.set(x, "hideSortIcon", js.undefined)
    
    inline def setIconComponent(value: ClassNameString => Element | Null): Self = StObject.set(x, "IconComponent", js.Any.fromFunction1(value))
    
    inline def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
