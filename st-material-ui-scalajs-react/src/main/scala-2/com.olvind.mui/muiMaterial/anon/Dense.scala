package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
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
trait Dense extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialListClasses] = js.native
  
  /**
    * If `true`, compact vertical padding designed for keyboard and mouse input is used for
    * the list and list items.
    * The prop is available to descendant components as the `dense` context.
    * @default false
    */
  var dense: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, vertical padding is removed from the list.
    * @default false
    */
  var disablePadding: js.UndefOr[Boolean] = js.native
  
  /**
    * The content of the subheader, normally `ListSubheader`.
    */
  var subheader: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
object Dense {
  
  @scala.inline
  def apply(): Dense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dense]
  }
  
  @scala.inline
  implicit class DenseMutableBuilder[Self <: Dense] (val x: Self) extends AnyVal {
    
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
    def setClasses(value: PartialListClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
    
    @scala.inline
    def setSubheader(value: VdomNode): Self = StObject.set(x, "subheader", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubheaderNull: Self = StObject.set(x, "subheader", null)
    
    @scala.inline
    def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    @scala.inline
    def setSubheaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subheader", js.Array(value :_*))
    
    @scala.inline
    def setSubheaderVdomElement(value: VdomElement): Self = StObject.set(x, "subheader", value.rawElement.asInstanceOf[js.Any])
    
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
