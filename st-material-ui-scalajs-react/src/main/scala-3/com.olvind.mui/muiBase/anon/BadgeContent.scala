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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeContent extends StObject {
  
  var anchorOrigin: BadgeOrigin
  
  var badgeContent: Node
  
  var displayValue: Node
  
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  var max: Double
  
  var variant: String
}
object BadgeContent {
  
  inline def apply(anchorOrigin: BadgeOrigin, max: Double, variant: String): BadgeContent = {
    val __obj = js.Dynamic.literal(anchorOrigin = anchorOrigin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], badgeContent = null, displayValue = null)
    __obj.asInstanceOf[BadgeContent]
  }
  
  extension [Self <: BadgeContent](x: Self) {
    
    inline def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setBadgeContent(value: VdomNode): Self = StObject.set(x, "badgeContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setBadgeContentNull: Self = StObject.set(x, "badgeContent", null)
    
    inline def setBadgeContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "badgeContent", js.Array(value*))
    
    inline def setBadgeContentVdomElement(value: VdomElement): Self = StObject.set(x, "badgeContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: VdomNode): Self = StObject.set(x, "displayValue", value.rawNode.asInstanceOf[js.Any])
    
    inline def setDisplayValueNull: Self = StObject.set(x, "displayValue", null)
    
    inline def setDisplayValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "displayValue", js.Array(value*))
    
    inline def setDisplayValueVdomElement(value: VdomElement): Self = StObject.set(x, "displayValue", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
