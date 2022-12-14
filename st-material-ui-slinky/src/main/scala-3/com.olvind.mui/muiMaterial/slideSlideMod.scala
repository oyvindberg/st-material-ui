package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.transitionsTransitionMod.TransitionProps
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
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
    var children_SlideProps: ReactElement
    
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
    
    inline def apply(children: ReactElement): SlideProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideProps]
    }
    
    extension [Self <: SlideProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setContainer(
        value: org.scalajs.dom.Element | (js.Function1[/* element */ org.scalajs.dom.Element, org.scalajs.dom.Element])
      ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerFunction1(value: /* element */ org.scalajs.dom.Element => org.scalajs.dom.Element): Self = StObject.set(x, "container", js.Any.fromFunction1(value))
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDirection(value: "left" | "right" | "up" | "down"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
