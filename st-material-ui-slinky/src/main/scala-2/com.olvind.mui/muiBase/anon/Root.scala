package com.olvind.mui.muiBase.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Root extends StObject {
  
  var Root: js.UndefOr[ReactElement] = js.native
}
object Root {
  
  @scala.inline
  def apply(): Root = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Root]
  }
  
  @scala.inline
  implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: ReactElement): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
