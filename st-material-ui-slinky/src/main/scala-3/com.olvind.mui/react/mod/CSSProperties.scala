package com.olvind.mui.react.mod

import com.olvind.mui.csstype.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSProperties
  extends StObject
     with Properties[String | Double, String] {
  
  /* fake member to keep old syntax */
  val hack: js.UndefOr[Any] = js.undefined
}
object CSSProperties {
  
  inline def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSProperties] (val x: Self) extends AnyVal {
    
    inline def setHack(value: Any): Self = StObject.set(x, "hack", value.asInstanceOf[js.Any])
    
    inline def setHackUndefined: Self = StObject.set(x, "hack", js.undefined)
  }
}
