package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.anon.Badge
import com.olvind.mui.muiBase.anon.BadgeRoot
import com.olvind.mui.muiBase.anon.PartialBadgeUnstyledClasses
import com.olvind.mui.muiBase.badgeUnstyledPropsMod.BadgeOrigin
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/BadgeUnstyled.BadgeUnstyledTypeMap<{}, 'span'>['props'] */
@js.native
trait BadgeUnstyledTypeMapspanprops extends StObject {
  
  /**
    * The anchor of the badge.
    * @default {
    *   vertical: 'top',
    *   horizontal: 'right',
    * }
    */
  var anchorOrigin: js.UndefOr[BadgeOrigin] = js.native
  
  /**
    * The content rendered within the badge.
    */
  var badgeContent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The badge will be added relative to this node.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialBadgeUnstyledClasses] = js.native
  
  /**
    * The components used for each slot inside the Badge.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var components: js.UndefOr[Badge] = js.native
  
  /**
    * The props used for each slot inside the Badge.
    * @default {}
    */
  var componentsProps: js.UndefOr[BadgeRoot] = js.native
  
  /**
    * If `true`, the badge is invisible.
    */
  var invisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Max count to show.
    * @default 99
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Controls whether the badge is hidden when `badgeContent` is zero.
    * @default false
    */
  var showZero: js.UndefOr[Boolean] = js.native
  
  /**
    * The variant to use.
    * @default 'standard'
    */
  var variant: js.UndefOr[String] = js.native
}
object BadgeUnstyledTypeMapspanprops {
  
  @scala.inline
  def apply(): BadgeUnstyledTypeMapspanprops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeUnstyledTypeMapspanprops]
  }
  
  @scala.inline
  implicit class BadgeUnstyledTypeMapspanpropsMutableBuilder[Self <: BadgeUnstyledTypeMapspanprops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    @scala.inline
    def setBadgeContent(value: ReactElement): Self = StObject.set(x, "badgeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialBadgeUnstyledClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setComponents(value: Badge): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsProps(value: BadgeRoot): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
