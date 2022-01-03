package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.transitionMod.TransitionProps
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomZoomMod {
  
  @JSImport("@mui/material/Zoom/Zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: ZoomProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait ZoomProps
    extends StObject
       with TransitionProps {
    
    /**
      * A single child content element.
      */
    @JSName("children")
    var children_ZoomProps: japgolly.scalajs.react.facade.React.Element = js.native
    
    /**
      * If `true`, the component will transition in.
      */
    @JSName("in")
    var in_ZoomProps: js.UndefOr[Boolean] = js.native
    
    var ref: js.UndefOr[Ref[Any]] = js.native
  }
  object ZoomProps {
    
    @scala.inline
    def apply(children: VdomElement): ZoomProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomProps]
    }
    
    @scala.inline
    implicit class ZoomPropsMutableBuilder[Self <: ZoomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
