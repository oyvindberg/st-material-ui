package com.olvind.mui.react

import com.olvind.mui.react.reactStrings.backwards
import com.olvind.mui.react.reactStrings.forwards
import com.olvind.mui.std.Exclude
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @js.native
    trait DirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with com.olvind.mui.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards = js.native
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.native
    }
    object DirectionalSuspenseListProps {
      
      @scala.inline
      def apply(children: Element | js.Iterable[Element], revealOrder: forwards | backwards): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class DirectionalSuspenseListPropsMutableBuilder[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    @js.native
    trait NonDirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with com.olvind.mui.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.native
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.native
    }
    object NonDirectionalSuspenseListProps {
      
      @scala.inline
      def apply(children: Element | js.Iterable[Element]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class NonDirectionalSuspenseListPropsMutableBuilder[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
      }
    }
    
    @js.native
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: Element | js.Iterable[Element] = js.native
    }
    object SuspenseListCommonProps {
      
      @scala.inline
      def apply(children: Element | js.Iterable[Element]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      @scala.inline
      implicit class SuspenseListCommonPropsMutableBuilder[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: Element | js.Iterable[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - `com.olvind.mui`.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
      - `com.olvind.mui`.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      @scala.inline
      def DirectionalSuspenseListProps(children: Element | js.Iterable[Element], revealOrder: forwards | backwards): com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
      }
      
      @scala.inline
      def NonDirectionalSuspenseListProps(children: Element | js.Iterable[Element]): com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
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
      
      @scala.inline
      def backwards: com.olvind.mui.react.reactStrings.backwards = "backwards".asInstanceOf[com.olvind.mui.react.reactStrings.backwards]
      
      @scala.inline
      def forwards: com.olvind.mui.react.reactStrings.forwards = "forwards".asInstanceOf[com.olvind.mui.react.reactStrings.forwards]
      
      @scala.inline
      def together: com.olvind.mui.react.reactStrings.together = "together".asInstanceOf[com.olvind.mui.react.reactStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - `com.olvind.mui`.react.reactStrings.collapsed
      - `com.olvind.mui`.react.reactStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      @scala.inline
      def collapsed: com.olvind.mui.react.reactStrings.collapsed = "collapsed".asInstanceOf[com.olvind.mui.react.reactStrings.collapsed]
      
      @scala.inline
      def hidden: com.olvind.mui.react.reactStrings.hidden = "hidden".asInstanceOf[com.olvind.mui.react.reactStrings.hidden]
    }
  }
}
