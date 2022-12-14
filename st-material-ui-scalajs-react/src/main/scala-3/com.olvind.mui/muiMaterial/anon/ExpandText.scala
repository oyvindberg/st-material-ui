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

trait ExpandText extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialBreadcrumbsClasses] = js.undefined
  
  /**
    * Override the default label for the expand button.
    *
    * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
    * @default 'Show path'
    */
  var expandText: js.UndefOr[String] = js.undefined
  
  /**
    * If max items is exceeded, the number of items to show after the ellipsis.
    * @default 1
    */
  var itemsAfterCollapse: js.UndefOr[Double] = js.undefined
  
  /**
    * If max items is exceeded, the number of items to show before the ellipsis.
    * @default 1
    */
  var itemsBeforeCollapse: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum number of breadcrumbs to display. When there are more
    * than the maximum number, only the first `itemsBeforeCollapse` and last `itemsAfterCollapse`
    * will be shown, with an ellipsis in between.
    * @default 8
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * Custom separator node.
    * @default '/'
    */
  var separator: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
}
object ExpandText {
  
  inline def apply(): ExpandText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandText]
  }
  
  extension [Self <: ExpandText](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialBreadcrumbsClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setExpandText(value: String): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    inline def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
    
    inline def setItemsAfterCollapse(value: Double): Self = StObject.set(x, "itemsAfterCollapse", value.asInstanceOf[js.Any])
    
    inline def setItemsAfterCollapseUndefined: Self = StObject.set(x, "itemsAfterCollapse", js.undefined)
    
    inline def setItemsBeforeCollapse(value: Double): Self = StObject.set(x, "itemsBeforeCollapse", value.asInstanceOf[js.Any])
    
    inline def setItemsBeforeCollapseUndefined: Self = StObject.set(x, "itemsBeforeCollapse", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setSeparator(value: VdomNode): Self = StObject.set(x, "separator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "separator", js.Array(value*))
    
    inline def setSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
    
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
