package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandText extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
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
  var separator: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The props used for each slot inside the Breadcumb.
    * @default {}
    */
  var slotProps: js.UndefOr[`3`] = js.undefined
  
  /**
    * The components used for each slot inside the Breadcumb.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var slots: js.UndefOr[CollapsedIcon] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
}
object ExpandText {
  
  inline def apply(): ExpandText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandText] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
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
    
    inline def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSlotProps(value: `3`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: CollapsedIcon): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
