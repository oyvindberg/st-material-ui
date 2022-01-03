package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.react.mod.CSSProperties
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style[C] extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[Any]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object Style {
  
  @scala.inline
  def apply[C](): Style[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style[C]]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style[_], C] (val x: Self with Style[C]) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
