package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledMod.PopperPlacementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var TransitionProps: js.UndefOr[In] = js.undefined
  
  var placement: PopperPlacementType
}
object Placement {
  
  inline def apply(placement: PopperPlacementType): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setTransitionProps(value: In): Self = StObject.set(x, "TransitionProps", value.asInstanceOf[js.Any])
    
    inline def setTransitionPropsUndefined: Self = StObject.set(x, "TransitionProps", js.undefined)
  }
}
