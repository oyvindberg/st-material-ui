package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Percent extends StObject {
  
  var percent: js.UndefOr[Double] = js.undefined
}
object Percent {
  
  inline def apply(): Percent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Percent] (val x: Self) extends AnyVal {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
