package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.transitionsTransitionMod.TransitionProps
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideSlideMod {
  
  @JSImport("@mui/material/Slide/Slide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SlideProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SlideProps
    extends StObject
       with TransitionProps {
    
    /**
      * A single child content element.
      */
    @JSName("children")
    var children_SlideProps: japgolly.scalajs.react.facade.React.Element
    
    /**
      * An HTML element, or a function that returns one.
      * It's used to set the container the Slide is transitioning from.
      */
    var container: js.UndefOr[
        Null | org.scalajs.dom.Element | (js.Function1[/* element */ org.scalajs.dom.Element, org.scalajs.dom.Element])
      ] = js.undefined
    
    /**
      * Direction the child node will enter from.
      * @default 'down'
      */
    var direction: js.UndefOr["left" | "right" | "up" | "down"] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object SlideProps {
    
    inline def apply(children: VdomElement): SlideProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideProps]
    }
    
    extension [Self <: SlideProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(
        value: org.scalajs.dom.Element | (js.Function1[/* element */ org.scalajs.dom.Element, org.scalajs.dom.Element])
      ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerFunction1(value: /* element */ org.scalajs.dom.Element => org.scalajs.dom.Element): Self = StObject.set(x, "container", js.Any.fromFunction1(value))
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDirection(value: "left" | "right" | "up" | "down"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
