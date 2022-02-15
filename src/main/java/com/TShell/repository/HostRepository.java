package com.TShell.repository;

import com.TShell.model.entity.Host;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.*;
import io.micronaut.data.model.*;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
/**
 * @author TheBlind
 * @date 2022/2/14
 */
@Repository
public interface HostRepository extends CrudRepository<Host, Long> { 


}
