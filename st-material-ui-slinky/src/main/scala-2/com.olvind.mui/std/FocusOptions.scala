package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusOptions extends StObject {
  
  /* standard dom */
  var preventScroll: js.UndefOr[Boolean] = js.native
}
object FocusOptions {
  
  @scala.inline
  def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  
  @scala.inline
  implicit class FocusOptionsMutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
