package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.asc
import com.olvind.mui.muiMaterial.muiMaterialStrings.desc
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
  /**
    * Sort icon to use.
    * @default ArrowDownwardIcon
    */
  var IconComponent: js.UndefOr[JSXElementConstructor[ClassNameString]] = js.native
  
  /**
    * If `true`, the label will have the active styling (should be true for the sorted column).
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Label contents, the arrow will be appended automatically.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTableSortLabelClasses] = js.native
  
  /**
    * The current sort direction.
    * @default 'asc'
    */
  var direction: js.UndefOr[asc | desc] = js.native
  
  /**
    * Hide sort icon when active is false.
    * @default false
    */
  var hideSortIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
object Active {
  
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
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
    def setClasses(value: PartialTableSortLabelClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHideSortIcon(value: Boolean): Self = StObject.set(x, "hideSortIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSortIconUndefined: Self = StObject.set(x, "hideSortIcon", js.undefined)
    
    @scala.inline
    def setIconComponent(value: ClassNameString => Element | Null): Self = StObject.set(x, "IconComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
  }
}
