package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.badgeUnstyledPropsMod.BadgeOrigin
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/BadgeUnstyled/BadgeUnstyledProps.BadgeUnstyledTypeMap<{}, 'span'>['props'] */
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
  var badgeContent: js.UndefOr[Node] = js.native
  
  /**
    * The badge will be added relative to this node.
    */
  var children: js.UndefOr[Node] = js.native
  
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
    def setBadgeContent(value: VdomNode): Self = StObject.set(x, "badgeContent", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeContentNull: Self = StObject.set(x, "badgeContent", null)
    
    @scala.inline
    def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
    
    @scala.inline
    def setBadgeContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "badgeContent", js.Array(value :_*))
    
    @scala.inline
    def setBadgeContentVdomElement(value: VdomElement): Self = StObject.set(x, "badgeContent", value.rawElement.asInstanceOf[js.Any])
    
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
