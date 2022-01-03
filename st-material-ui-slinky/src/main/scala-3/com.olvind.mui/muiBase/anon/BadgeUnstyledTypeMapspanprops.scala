package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.badgeUnstyledPropsMod.BadgeOrigin
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/BadgeUnstyled/BadgeUnstyledProps.BadgeUnstyledTypeMap<{}, 'span'>['props'] */
trait BadgeUnstyledTypeMapspanprops extends StObject {
  
  /**
    * The anchor of the badge.
    * @default {
    *   vertical: 'top',
    *   horizontal: 'right',
    * }
    */
  var anchorOrigin: js.UndefOr[BadgeOrigin] = js.undefined
  
  /**
    * The content rendered within the badge.
    */
  var badgeContent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The badge will be added relative to this node.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialBadgeUnstyledClasses] = js.undefined
  
  /**
    * The components used for each slot inside the Badge.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var components: js.UndefOr[Badge] = js.undefined
  
  /**
    * The props used for each slot inside the Badge.
    * @default {}
    */
  var componentsProps: js.UndefOr[BadgeRoot] = js.undefined
  
  /**
    * If `true`, the badge is invisible.
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Max count to show.
    * @default 99
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the badge is hidden when `badgeContent` is zero.
    * @default false
    */
  var showZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The variant to use.
    * @default 'standard'
    */
  var variant: js.UndefOr[String] = js.undefined
}
object BadgeUnstyledTypeMapspanprops {
  
  inline def apply(): BadgeUnstyledTypeMapspanprops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeUnstyledTypeMapspanprops]
  }
  
  extension [Self <: BadgeUnstyledTypeMapspanprops](x: Self) {
    
    inline def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    inline def setBadgeContent(value: ReactElement): Self = StObject.set(x, "badgeContent", value.asInstanceOf[js.Any])
    
    inline def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialBadgeUnstyledClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setComponents(value: Badge): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: BadgeRoot): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
