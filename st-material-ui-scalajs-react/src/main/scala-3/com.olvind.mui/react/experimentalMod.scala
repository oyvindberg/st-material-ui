package com.olvind.mui.react

import com.olvind.mui.std.Exclude
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait DirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: "forwards" | "backwards"
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.undefined
    }
    object DirectionalSuspenseListProps {
      
      inline def apply(children: Element | js.Iterable[Element], revealOrder: "forwards" | "backwards"): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        inline def setRevealOrder(value: "forwards" | "backwards"): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        inline def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    trait NonDirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, "forwards" | "backwards"]] = js.undefined
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.undefined
    }
    object NonDirectionalSuspenseListProps {
      
      inline def apply(children: Element | js.Iterable[Element]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        inline def setRevealOrder(value: Exclude[SuspenseListRevealOrder, "forwards" | "backwards"]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
      }
    }
    
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: Element | js.Iterable[Element]
    }
    object SuspenseListCommonProps {
      
      inline def apply(children: Element | js.Iterable[Element]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: Element | js.Iterable[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      }
    }
    
    object SuspenseListRevealOrder {
      
      inline def backwards: "backwards" = "backwards".asInstanceOf["backwards"]
      
      inline def forwards: "forwards" = "forwards".asInstanceOf["forwards"]
      
      inline def together: "together" = "together".asInstanceOf["together"]
    }
    type SuspenseListRevealOrder = "forwards" | "backwards" | "together"
    
    object SuspenseListTailMode {
      
      inline def collapsed: "collapsed" = "collapsed".asInstanceOf["collapsed"]
      
      inline def hidden: "hidden" = "hidden".asInstanceOf["hidden"]
    }
    type SuspenseListTailMode = "collapsed" | "hidden"
  }
}
