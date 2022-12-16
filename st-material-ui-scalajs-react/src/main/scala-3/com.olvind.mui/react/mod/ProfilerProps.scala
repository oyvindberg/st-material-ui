package com.olvind.mui.react.mod

import com.olvind.mui.scheduler.tracingMod.Interaction
import com.olvind.mui.std.Set
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var id: String
  
  var onRender: ProfilerOnRenderCallback
}
object ProfilerProps {
  
  inline def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ "mount" | "update", /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Callback
  ): ProfilerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7((t0: /* id */ String, t1: /* phase */ "mount" | "update", t2: /* actualDuration */ Double, t3: /* baseDuration */ Double, t4: /* startTime */ Double, t5: /* commitTime */ Double, t6: /* interactions */ Set[Interaction]) => (onRender(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    __obj.asInstanceOf[ProfilerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnRender(
      value: (/* id */ String, /* phase */ "mount" | "update", /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[Interaction]) => Callback
    ): Self = StObject.set(x, "onRender", js.Any.fromFunction7((t0: /* id */ String, t1: /* phase */ "mount" | "update", t2: /* actualDuration */ Double, t3: /* baseDuration */ Double, t4: /* startTime */ Double, t5: /* commitTime */ Double, t6: /* interactions */ Set[Interaction]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
  }
}
