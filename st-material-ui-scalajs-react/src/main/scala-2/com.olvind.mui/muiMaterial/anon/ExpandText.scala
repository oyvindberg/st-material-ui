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
trait ExpandText extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialBreadcrumbsClasses] = js.native
  
  /**
    * Override the default label for the expand button.
    *
    * For localization purposes, you can use the provided [translations](/guides/localization/).
    * @default 'Show path'
    */
  var expandText: js.UndefOr[String] = js.native
  
  /**
    * If max items is exceeded, the number of items to show after the ellipsis.
    * @default 1
    */
  var itemsAfterCollapse: js.UndefOr[Double] = js.native
  
  /**
    * If max items is exceeded, the number of items to show before the ellipsis.
    * @default 1
    */
  var itemsBeforeCollapse: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the maximum number of breadcrumbs to display. When there are more
    * than the maximum number, only the first `itemsBeforeCollapse` and last `itemsAfterCollapse`
    * will be shown, with an ellipsis in between.
    * @default 8
    */
  var maxItems: js.UndefOr[Double] = js.native
  
  /**
    * Custom separator node.
    * @default '/'
    */
  var separator: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
object ExpandText {
  
  @scala.inline
  def apply(): ExpandText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandText]
  }
  
  @scala.inline
  implicit class ExpandTextMutableBuilder[Self <: ExpandText] (val x: Self) extends AnyVal {
    
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
    def setClasses(value: PartialBreadcrumbsClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setExpandText(value: String): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
    
    @scala.inline
    def setItemsAfterCollapse(value: Double): Self = StObject.set(x, "itemsAfterCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsAfterCollapseUndefined: Self = StObject.set(x, "itemsAfterCollapse", js.undefined)
    
    @scala.inline
    def setItemsBeforeCollapse(value: Double): Self = StObject.set(x, "itemsBeforeCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsBeforeCollapseUndefined: Self = StObject.set(x, "itemsBeforeCollapse", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    @scala.inline
    def setSeparator(value: VdomNode): Self = StObject.set(x, "separator", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorNull: Self = StObject.set(x, "separator", null)
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "separator", js.Array(value :_*))
    
    @scala.inline
    def setSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
    
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
