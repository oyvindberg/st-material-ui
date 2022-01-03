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

@js.native
trait BadgeContent extends StObject {
  
  var anchorOrigin: BadgeOrigin = js.native
  
  var badgeContent: Node = js.native
  
  var displayValue: Node = js.native
  
  var invisible: js.UndefOr[Boolean] = js.native
  
  var max: Double = js.native
  
  var variant: String = js.native
}
object BadgeContent {
  
  @scala.inline
  def apply(anchorOrigin: BadgeOrigin, max: Double, variant: String): BadgeContent = {
    val __obj = js.Dynamic.literal(anchorOrigin = anchorOrigin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], badgeContent = null, displayValue = null)
    __obj.asInstanceOf[BadgeContent]
  }
  
  @scala.inline
  implicit class BadgeContentMutableBuilder[Self <: BadgeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeContent(value: VdomNode): Self = StObject.set(x, "badgeContent", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeContentNull: Self = StObject.set(x, "badgeContent", null)
    
    @scala.inline
    def setBadgeContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "badgeContent", js.Array(value :_*))
    
    @scala.inline
    def setBadgeContentVdomElement(value: VdomElement): Self = StObject.set(x, "badgeContent", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: VdomNode): Self = StObject.set(x, "displayValue", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValueNull: Self = StObject.set(x, "displayValue", null)
    
    @scala.inline
    def setDisplayValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "displayValue", js.Array(value :_*))
    
    @scala.inline
    def setDisplayValueVdomElement(value: VdomElement): Self = StObject.set(x, "displayValue", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
