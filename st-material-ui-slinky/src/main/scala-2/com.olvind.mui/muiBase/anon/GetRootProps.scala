package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRootProps extends StObject {
  
  def getRootProps(): Arialabelledby = js.native
  
  var hidden: Boolean = js.native
}
object GetRootProps {
  
  @scala.inline
  def apply(getRootProps: () => Arialabelledby, hidden: Boolean): GetRootProps = {
    val __obj = js.Dynamic.literal(getRootProps = js.Any.fromFunction0(getRootProps), hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootProps]
  }
  
  @scala.inline
  implicit class GetRootPropsMutableBuilder[Self <: GetRootProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRootProps(value: () => Arialabelledby): Self = StObject.set(x, "getRootProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
