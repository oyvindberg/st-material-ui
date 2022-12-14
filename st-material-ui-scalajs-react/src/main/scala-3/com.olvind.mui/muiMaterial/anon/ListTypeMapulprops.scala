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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/material.@mui/material/List/List.ListTypeMap<{}, 'ul'>['props'] */
trait ListTypeMapulprops extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialListClasses] = js.undefined
  
  /**
    * If `true`, compact vertical padding designed for keyboard and mouse input is used for
    * the list and list items.
    * The prop is available to descendant components as the `dense` context.
    * @default false
    */
  var dense: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, vertical padding is removed from the list.
    * @default false
    */
  var disablePadding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the subheader, normally `ListSubheader`.
    */
  var subheader: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
}
object ListTypeMapulprops {
  
  inline def apply(): ListTypeMapulprops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeMapulprops]
  }
  
  extension [Self <: ListTypeMapulprops](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialListClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
    
    inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
    
    inline def setSubheader(value: VdomNode): Self = StObject.set(x, "subheader", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubheaderNull: Self = StObject.set(x, "subheader", null)
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    inline def setSubheaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subheader", js.Array(value*))
    
    inline def setSubheaderVdomElement(value: VdomElement): Self = StObject.set(x, "subheader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
