package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.transitionMod.TransitionProps
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomZoomMod {
  
  @JSImport("@mui/material/Zoom/Zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ZoomProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ZoomProps
    extends StObject
       with TransitionProps {
    
    /**
      * A single child content element.
      */
    @JSName("children")
    var children_ZoomProps: ReactElement
    
    /**
      * If `true`, the component will transition in.
      */
    @JSName("in")
    var in_ZoomProps: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ZoomProps {
    
    inline def apply(children: ReactElement): ZoomProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomProps]
    }
    
    extension [Self <: ZoomProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
