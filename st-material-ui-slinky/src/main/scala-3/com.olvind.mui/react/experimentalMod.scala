package com.olvind.mui.react

import com.olvind.mui.react.reactStrings.backwards
import com.olvind.mui.react.reactStrings.forwards
import com.olvind.mui.std.Exclude
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait DirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with com.olvind.mui.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards
      
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
      
      inline def apply(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      extension [Self <: DirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        inline def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    trait NonDirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with com.olvind.mui.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.undefined
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.undefined
    }
    object NonDirectionalSuspenseListProps {
      
      inline def apply(children: ReactElement | js.Iterable[ReactElement]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      extension [Self <: NonDirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
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
      var children: ReactElement | js.Iterable[ReactElement]
    }
    object SuspenseListCommonProps {
      
      inline def apply(children: ReactElement | js.Iterable[ReactElement]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      extension [Self <: SuspenseListCommonProps](x: Self) {
        
        inline def setChildren(value: ReactElement | js.Iterable[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - `com.olvind.mui`.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
      - `com.olvind.mui`.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      inline def DirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
      }
      
      inline def NonDirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement]): com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - `com.olvind.mui`.react.reactStrings.forwards
      - `com.olvind.mui`.react.reactStrings.backwards
      - `com.olvind.mui`.react.reactStrings.together
    */
    trait SuspenseListRevealOrder extends StObject
    object SuspenseListRevealOrder {
      
      inline def backwards: com.olvind.mui.react.reactStrings.backwards = "backwards".asInstanceOf[com.olvind.mui.react.reactStrings.backwards]
      
      inline def forwards: com.olvind.mui.react.reactStrings.forwards = "forwards".asInstanceOf[com.olvind.mui.react.reactStrings.forwards]
      
      inline def together: com.olvind.mui.react.reactStrings.together = "together".asInstanceOf[com.olvind.mui.react.reactStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - `com.olvind.mui`.react.reactStrings.collapsed
      - `com.olvind.mui`.react.reactStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      inline def collapsed: com.olvind.mui.react.reactStrings.collapsed = "collapsed".asInstanceOf[com.olvind.mui.react.reactStrings.collapsed]
      
      inline def hidden: com.olvind.mui.react.reactStrings.hidden = "hidden".asInstanceOf[com.olvind.mui.react.reactStrings.hidden]
    }
  }
}
