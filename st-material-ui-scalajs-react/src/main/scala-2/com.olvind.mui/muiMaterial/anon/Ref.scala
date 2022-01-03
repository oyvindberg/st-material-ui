package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends StObject {
  
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer RefType */ js.Any
  ] = js.native
}
object Ref {
  
  @scala.inline
  def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer RefType */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
