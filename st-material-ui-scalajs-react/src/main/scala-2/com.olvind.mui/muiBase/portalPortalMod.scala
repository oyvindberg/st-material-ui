package com.olvind.mui.muiBase

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalPortalMod {
  
  @js.native
  trait PortalProps extends StObject {
    
    /**
      * The children to render into the `container`.
      */
    var children: js.UndefOr[Node] = js.native
    
    /**
      * An HTML element or function that returns one.
      * The `container` will have the portal children appended to it.
      *
      * By default, it uses the body of the top-level document object,
      * so it's simply `document.body` most of the time.
      */
    var container: js.UndefOr[Element | (js.Function0[Element | Null]) | Null] = js.native
    
    /**
      * The `children` will be under the DOM hierarchy of the parent component.
      * @default false
      */
    var disablePortal: js.UndefOr[Boolean] = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: Element | (js.Function0[Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerCallbackTo(value: CallbackTo[Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
    }
  }
}
