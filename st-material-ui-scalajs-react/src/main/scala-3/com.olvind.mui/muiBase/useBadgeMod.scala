package com.olvind.mui.muiBase

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

object useBadgeMod {
  
  trait UseBadgeProps extends StObject {
    
    var anchorOrigin: js.UndefOr[BadgeOrigin] = js.undefined
    
    var badgeContent: js.UndefOr[Node] = js.undefined
    
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var showZero: js.UndefOr[Boolean] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object UseBadgeProps {
    
    inline def apply(): UseBadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseBadgeProps]
    }
    
    extension [Self <: UseBadgeProps](x: Self) {
      
      inline def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setBadgeContent(value: VdomNode): Self = StObject.set(x, "badgeContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBadgeContentNull: Self = StObject.set(x, "badgeContent", null)
      
      inline def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
      
      inline def setBadgeContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "badgeContent", js.Array(value*))
      
      inline def setBadgeContentVdomElement(value: VdomElement): Self = StObject.set(x, "badgeContent", value.rawElement.asInstanceOf[js.Any])
      
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
}
